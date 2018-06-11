module haystack.proxy {
    requires spring.web;
    requires javax.inject;
    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.webflux;
    requires reactor.core;
    requires reactor.netty;
    requires io.netty.codec.http;
    requires org.reactivestreams;
    requires io.netty.transport;
    requires io.netty.codec;
}
