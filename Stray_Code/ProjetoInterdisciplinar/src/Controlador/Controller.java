package Controlador;
import View.Interface;
import Model.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Controller implements Serializable {
    private List<Usuario> listaUsuarios;
    
    public Controller(){
        listaUsuarios = new ArrayList<Usuario>();
    }
    
    public void cadastrarInicio(String usuario, String senha){
        listaUsuarios.add(new Usuario(usuario, senha));
    }
    
    public void entrarUsuario(String usuario, String senha){
        if (usuario.equals(usuario) && senha.equals(senha)){
            
        }
    }
}
