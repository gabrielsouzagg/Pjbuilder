
package br.com.builder.principal.certo;

import br.com.builder.model.certo.Cliente;

/**
 *
 * @author biels
 */
public class Principal {
    public static void main(String[] args) {
        Cliente cli = new Cliente.ClienteBuilder()
                                  .nome("Gabriel")
                                  .endereço("viela santana")
                                  .cidade("Santa Ernestina")
                                  .cpf("153.525.444.00")
                                  .rg("98.455.151")
                                  .email("bile@gmail.com")
                                  .telefone("16996338675")
                                  .Build();
        
        System.out.print(cli.toString());
                                  
                  
                                  
    }
}
