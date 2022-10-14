public class ExemploComparacao {
    public static void main(String[] args) {
        int x = 5;
		int y = 3;
		// operarações de comparação !
		System.out.println(x == y);// true or false???(false)
		System.out.println(x != y);// diferente de y.(true)
		System.out.println(x > y);// maior que y.(true)
		System.out.println(x < y);//menor que y.(false)
		System.out.println(x >= y);//maior igual a y.(true)
		System.out.println(x <= y);//menor igual a y.(false)
        System.out.println("==Operaçõess Lógicas==");
        boolean a = true;
        System.out.println(a && true && 3 < 8 );

        boolean vaiTerAula;//??
        boolean diaSemana = true;
        boolean feriado= true;
        vaiTerAula = diaSemana && !feriado;
        System.out.println(vaiTerAula);
        System.out.println(diaSemana == true && feriado == false);       
    }
    
}
