package com.github.example.springredistplexample;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BaseAPI {

    @NonNull
    private final Storage storage;

    @PostMapping(path = "addModel", params = {"id", "data"})
    public void addModel(@RequestParam("id") String id, @RequestParam("data") String data) {
        storage.save(Model.builder()
                .id(id)
                .data(data)
                .build());
    }

    @GetMapping(path = "getModel", params = {"id"})
    public Model getModel(@RequestParam("id") String id) {
        return storage.findById(id).orElseThrow();
    }
}
