public class Lab {

    public static void main(String[] args) {
        Lab paciente1 = new Lab();
    //dados paciente    
        paciente1.setNome_paciente("Lucas Bleyer");
        paciente1.setCpf_paciente("123.456.789-10");
        paciente1.setIdade_paciente(21);   
        paciente1.setAno_nasc(2000);
        paciente1.setMes_nasc(2);
        paciente1.setDia_nasc(9);
        paciente1.setAno_retorno(2018);
        paciente1.setMes_retorno(4);
        paciente1.setDia_retorno(20);
    //metodo de calculo das datas
        paciente1.calculo_idade_paciente();
    //mostre
        System.out.println(paciente1.toString());
    }  
}