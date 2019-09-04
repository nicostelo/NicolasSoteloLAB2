public class ProgramaCuenta {

    public static void main(String[] args) {

            CuentaCorriente cuenta1 = new CuentaCorriente("Martin", 30000);
            CuentaCorriente cuenta2 = new CuentaCorriente("Javier", 10000);
            cuenta1.setReintegro(200);
            cuenta2.setIngreso(200);
            System.out.println(cuenta1.getDatos());
            System.out.println(cuenta2.getDatos());

        }

    }
