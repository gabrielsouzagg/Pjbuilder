
package br.com.builder.model.certo;


public class Cliente {
  
    private String nome;
     private String endereço;
      private String cidade;
       private String cpf;
        private String rg;
         private String email;
          private String telefone;

    private Cliente(String nome, String endereço, String cidade, String cpf, String rg, String email, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.cidade = cidade;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endere\u00e7o=" + endereço + ", cidade=" + cidade + ", cpf=" + cpf + ", rg=" + rg + ", email=" + email + ", telefone=" + telefone + '}';
    }

      public static class ClienteBuilder{    
          private String nome;
          private String endereço;
          private String cidade;
          private String cpf;
          private String rg;
          private String email;
          private String telefone;
          
          
          public ClienteBuilder nome(String nome) {
              this.nome = nome;
              return this;
          }
          
            public ClienteBuilder endereço(String endereço) {
              this.endereço = endereço;
              return this;
          }
            
              public ClienteBuilder cidade(String cidade) {
              this.cidade = cidade;
              return this;
          }
              
                public ClienteBuilder cpf(String cpf) {
              this.cpf = cpf;
              return this;
          }
                
               public ClienteBuilder rg(String rg) {
              this.rg = rg;
              return this;
          }
                  
                public ClienteBuilder email(String email) {
              this.email = email;
              return this;
          }
               public ClienteBuilder telefone(String telefone) {
              this.telefone = telefone;
              return this;
          }
               
               
             public Cliente Build() {
            return new Cliente(nome, endereço, cidade, cpf, rg, email, telefone);
      }
      }
}
