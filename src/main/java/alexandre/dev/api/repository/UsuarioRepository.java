package alexandre.dev.api.repository;

import alexandre.dev.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void remove(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }

    public List<Usuario> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Alexandre","senhaDificil123"));
        usuarios.add(new Usuario("Athos","SenhaSuperDificil@1234"));
        return usuarios;
    }

    public Usuario finById(Integer id){
        System.out.printf("FIND/id - Recebendo o id: %d para localizar um usuário%n", id);
        return new Usuario("gleyson","password");
    }

}
