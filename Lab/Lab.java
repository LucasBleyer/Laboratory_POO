public class Laboratorio {
//dados gerais do paciente    
    private String nome_paciente;
    private String cpf_paciente;
    private int idade_paciente;
//data nascimento    
    private int ano_nasc;
    private int mes_nasc;
    private int dia_nasc;
//data_retorno;
    private int ano_retorno;
    private int mes_retorno;
    private int dia_retorno;
//calc dias paciente
    private int dias_paciente;
//calc meses paciente
    private int meses_paciente;
      
//construtores
    public Laboratorio() {
    }

    public Laboratorio(String nome_paciente, String cpf_paciente, int idade_paciente, int ano_nasc, int mes_nasc, int dia_nasc, int ano_retorno, int mes_retorno, int dia_retorno, int dias_paciente, int meses_paciente) {
        this.nome_paciente = nome_paciente;
        this.cpf_paciente = cpf_paciente;
        this.idade_paciente = idade_paciente;
        this.ano_nasc = ano_nasc;
        this.mes_nasc = mes_nasc;
        this.dia_nasc = dia_nasc;
        this.ano_retorno = ano_retorno;
        this.mes_retorno = mes_retorno;
        this.dia_retorno = dia_retorno;
        this.dias_paciente = dias_paciente;
        this.meses_paciente = meses_paciente;
    }
  
//setters e getters    
    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public String getCpf_paciente() {
        return cpf_paciente;
    }

    public void setCpf_paciente(String cpf_paciente) {
        this.cpf_paciente = cpf_paciente;
    }

    public int getIdade_paciente() {
        return idade_paciente;
    }

    public void setIdade_paciente(int idade_paciente) {
        this.idade_paciente = idade_paciente;
    }

    public int getAno_nasc() {
        return ano_nasc;
    }

    public void setAno_nasc(int ano_nasc) {
        this.ano_nasc = ano_nasc;
    }

    public int getMes_nasc() {
        return mes_nasc;
    }

    public void setMes_nasc(int mes_nasc) {
        this.mes_nasc = mes_nasc;
    }

    public int getDia_nasc() {
        return dia_nasc;
    }

    public void setDia_nasc(int dia_nasc) {
        this.dia_nasc = dia_nasc;
    }

    public int getAno_retorno() {
        return ano_retorno;
    }

    public void setAno_retorno(int ano_retorno) {
        this.ano_retorno = ano_retorno;
    }

    public int getMes_retorno() {
        return mes_retorno;
    }

    public void setMes_retorno(int mes_retorno) {
        this.mes_retorno = mes_retorno;
    }

    public int getDia_retorno() {
        return dia_retorno;
    }

    public void setDia_retorno(int dia_retorno) {
        this.dia_retorno = dia_retorno;
    }

    public int getDias_paciente() {
        return dias_paciente;
    }

    public void setDias_paciente(int dias_paciente) {
        this.dias_paciente = dias_paciente;
    }

    public int getMeses_paciente() {
        return meses_paciente;
    }

    public void setMeses_paciente(int meses_paciente) {
        this.meses_paciente = meses_paciente;
    }
    
//metodo para calcular datas/idades
    public void calculo_idade_paciente(){
        if (this.mes_nasc <= this.mes_retorno) {
            this.idade_paciente = (this.ano_retorno - this.ano_nasc);
            if (this.dia_nasc >= this.dia_retorno) {
                this.meses_paciente = (this.mes_retorno - this.mes_nasc) + (this.idade_paciente * 12) - 1;
                this.dias_paciente = 30 - (this.dia_nasc - this.dia_retorno) + (this.meses_paciente * 30);
            }
            else{
                this.meses_paciente = (this.mes_retorno - this.mes_nasc) + (this.idade_paciente * 12);
                this.dias_paciente = (this.dia_retorno - this.dia_nasc) + (this.meses_paciente * 30);
                }
            } 
            else{
                this.idade_paciente = (this.ano_retorno - this.ano_nasc) - 1;
                if (this.dia_nasc > this.dia_retorno) {
                    this.meses_paciente = 12 - (this.mes_nasc - this.mes_retorno) + (this.idade_paciente * 12) - 1;
                    this.dias_paciente = 30 - (this.dia_nasc - this.dia_retorno) + (this.meses_paciente * 30);
                }
                else{
                   this.meses_paciente = (this.mes_retorno - this.mes_nasc) + (this.idade_paciente * 12);
                   this.dias_paciente = (this.dia_retorno - this.dia_nasc) + (this.meses_paciente * 30);
                }
            }
    }  
    
//to String para mostrar os resultados    
    @Override
    public String toString() {
        return "Laboratorio{" + "Nome do(a) Paciente: " + nome_paciente + ", CPF do(a) Paciente: " + cpf_paciente + ", Idade do(a) Paciente: " + idade_paciente + ", Ano de Nascimento: " + ano_nasc + 
                ", Mes de nascimento: " + mes_nasc + ", Dia de Nascimento: " + dia_nasc + ", Ano de retorno do(a) Paciente: " + ano_retorno + ", Mês de retorno do(a) Paciente: " + mes_retorno + 
                ", Dia do retorno do(a) Paciente: " + dia_retorno + ", Dias do(a) Paciente: " + dias_paciente + ", Meses do(a) Paciente: " + meses_paciente + '}';
    } 
}