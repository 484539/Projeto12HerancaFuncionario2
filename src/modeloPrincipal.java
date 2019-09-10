/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class modeloPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNome("Lucas");
        objFunc01.setSalario(500);
        objFunc01.setCpf("123456789");
        System.out.println("Func01 "+objFunc01.getNome());
        System.out.println("Info: " + objFunc01.getInformacao());
    
        Gerente objGer01 = new Gerente();
        objGer01.setNome("Maria");
        objGer01.setSalario(900);
        objGer01.setCpf("9999999");
        objGer01.setSetor("ADM");
        objGer01.setSenha("858582");
        System.out.println("Gerente01 "+objGer01.getNome());
        System.out.println(objGer01.getInformacao());
        objGer01.getAutenticacao("858");
        
        //Funcionario objFunc02 = new Gerente();
        //casting entre objetos (classes)
        //da mesma forma que vimos em tipos PRIMITIVOS USANDO CASTING
        //Gerente objGer02 = (Gerente) new Funcionario();
        
        //atribuicao entre objetos
        //utilizando casting
        //objFunc02 = objGer02;
        //objGer02 = (Gerente) objFunc02;
        
        
    }
    
}
