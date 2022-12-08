public class PessoaJuridica extends Conta {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica ( String nome, String cnpj, String razaSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaSocial;
    }
    public String getRazaoSocial(){
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String toString(){
        return "\nNome: "+this.getNome()+
               "\nCnpj: "+this.getCnpj() +
               "\nRazao social:"+ this.getRazaoSocial();
     }
     private String getNome() {
        return null;
}
}