package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostRest {

    private List<Post> listaDePosts = new ArrayList<>();

    int contador = 1;

    @GetMapping
    public List<Post> all() {
        return listaDePosts;
    }

    @GetMapping("/{id}")
    public Post one(@PathVariable ("id") int id) {

        for (Post post : listaDePosts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") int id) {

        Post postParaDeletar = one(id);
        if (postParaDeletar != null) {
            listaDePosts.remove(postParaDeletar);
        }
    }

    @PostMapping
    public Post create(@RequestBody Post requestBody) {

        requestBody.setId(contador);
        contador++;

        listaDePosts.add(requestBody);

        return requestBody;
    }

    @PutMapping("/{id}")
    public Post update(@PathVariable ("id") int id, @RequestBody Post requestBody) {

        Post postParaAtualizar = one(id);
        if (postParaAtualizar != null) {
            postParaAtualizar.setUserId(requestBody.getUserId());
            postParaAtualizar.setTitle(requestBody.getTitle());
            postParaAtualizar.setBody(requestBody.getBody());

            return postParaAtualizar;
        }
        return null;
    }
}
