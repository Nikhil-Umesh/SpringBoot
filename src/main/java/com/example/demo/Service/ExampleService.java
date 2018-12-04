package com.example.demo.Service;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
import static java.lang.Thread.currentThread;

import io.reactivex.Flowable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.schedulers.Schedulers;

@Slf4j
@Service
public class ExampleService {

  int a=10;

  public void test(){
    log.warn(String.valueOf(a));
    Observable.just(1, 2, 3, 4, 5, 6)
        .subscribeOn(Schedulers.computation())
        .doOnNext(integer -> println("Emitting item " + integer + " on: " + currentThread().getName()))
        .serialize()
        .subscribe(integer -> println("Consuming item " + integer + " on: " + currentThread().getName()));

  }

}
