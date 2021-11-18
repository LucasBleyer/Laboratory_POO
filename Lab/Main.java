public class Lab {

    public static void main(String[] args) {
        Lab pacient1 = new Lab();
    //pacient   
        paciente1.setName_pacient("Chuck Berry");
        paciente1.setNumber_pacient("123.456.789-10");
        paciente1.setAge_pacient(51);   
        paciente1.setYear_born(1970);
        paciente1.setMonth_born(7);
        paciente1.setDay_born(4);
        paciente1.setYear_return(2018);
        paciente1.setMonth_return(4);
        paciente1.setDay_return(20);
    //method of calcule of dates and months
        paciente1.calculo_idade_paciente();
    //show the result with to String
        System.out.println(paciente1.toString());
    }
    
}