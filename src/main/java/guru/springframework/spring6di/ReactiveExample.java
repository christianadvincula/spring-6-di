package guru.springframework.spring6di;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveExample {

    public static void main(String[] args) {
        // Creating a simple Mono (a stream of 0 or 1 element)
        Mono<String> mono = Mono.just("Hello, Reactive!");

        // Subscribing to the Mono and printing the result
        mono.subscribe(System.out::println);

        // Creating a simple Flux (a stream of multiple elements)
        Flux<Integer> flux = Flux.range(1, 5);

        // Subscribing to the Flux and printing the elements
        flux.subscribe(System.out::println);

        // Performing transformations on a Flux
        Flux<Integer> transformedFlux = flux.map(x -> x * 2);

        // Subscribing to the transformed Flux and printing the elements
        transformedFlux.subscribe(System.out::println);
    }
}

