package com.example.wang.service;

import com.codenotfound.grpc.helloworld.Greeting;
import com.codenotfound.grpc.helloworld.HelloWorldServiceGrpc;
import com.codenotfound.grpc.helloworld.Person;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * package: com.example.wang.service
 *
 * @author yangzai@ibantang.com
 * @date 2019-04-10 18:46
 */
@GRpcService
public class HelloService extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloService.class);


    @Override
    public void sayHello(Person request,
                         StreamObserver<Greeting> responseObserver) {
        LOGGER.info("server received {}", request);

        String message = "Hello " + request.getFirstName() + " "
                + request.getLastName() + "!";
        Greeting greeting =
                Greeting.newBuilder().setMessage(message).build();
        LOGGER.info("server responded {}", greeting);

        responseObserver.onNext(greeting);
        responseObserver.onCompleted();
    }

}
