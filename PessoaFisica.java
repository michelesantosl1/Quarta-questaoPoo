public class PessoaFisica extends Conta{
    protected String cpf;
    protected String sobrenome;

    public PessoaFisica(String nome, String sobrenome, String cpf){
       this.cpf = cpf;
       this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
       return sobrenome;
    }
    public void setSobrenome(String sobrenome){
       this.sobrenome = sobrenome;
    }
    public String getCpf(){
       return cpf;
    }
    public void setCpf(String cpf) {
       this.cpf = cpf;
    }
    public String toString(){
       return "\nNome: "+this.getNome()+
       "\nSobrenome: "+this.getSobrenome() +
       "\nCpf"+ this.getCpf();
    }
   private String getNome() {
       return null;
   }
}
