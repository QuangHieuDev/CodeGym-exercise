package com.backend.controller;

import com.backend.model.Post;
import com.backend.service.BlogService;
import com.backend.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@CrossOrigin("*")
@RestController
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Post>> list() {
        List<Post> listPost = (List<Post>) blogService.findAll();
        if (listPost.isEmpty()) {
            return new ResponseEntity<List<Post>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Post>>(listPost, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> post(@PathVariable("id") long id){
        Post post = (Post) blogService.findById(id).orElse(null);
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@RequestBody Post post) {
        blogService.save(post);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.OK);
    }

    @PutMapping(value = "/edit/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Post> update(@PathVariable("id") long id, @RequestBody Post post) {
        Post temp = (Post) blogService.findById(id).orElse(null);
        if (temp == null) {
            return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
        }
        blogService.save(post);
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Post> remove(@PathVariable("id") long id) {
        Post temp = (Post) blogService.findById(id).orElse(null);
        if (temp == null) {
            return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity<Post>(HttpStatus.OK);
    }

}
