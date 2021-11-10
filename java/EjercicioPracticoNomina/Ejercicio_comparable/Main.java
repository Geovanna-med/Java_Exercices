public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];
        Nomina nomina = new Nomina(empleados);

        nomina.altaEmpleado(new Administrador("Geovanna", 90, 11, 15));
        nomina.altaEmpleado(new Jornalero("Gabriel", 70, 20, 15));
        nomina.altaEmpleado(new Administrador("Fernanda", 80, 10, 15));
        nomina.altaEmpleado(new Jornalero("Tony", 50, 0, 15));

        for (int i = 0; i <= 3; i++) {
            System.out.println(nomina.getEmpleados()[i] + "\n");
        }

        double[] SueldosAdmin = new double[10];
        double[] SueldosJornalero = new double[10];
        double[] HorasAdmins = new double[10];
        double[] HorasJornalero = new double[10];

        int noJornalero = 0;
        int noAdmin = 0;

        for (int i = 0; i <= 3; i++) {
            if (empleados[i] instanceof Administrador) {
                Administrador temp = (Administrador) empleados[i];
                SueldosAdmin[noAdmin] = temp.getSalario();
                HorasAdmins[noAdmin] = temp.getNumHorasTrabajadas() + temp.getHorasExtras();
                noAdmin++;
            } else {
                if (empleados[i] instanceof Jornalero) {
                    Jornalero temp = (Jornalero) empleados[i];
                    SueldosJornalero[noJornalero] = temp.getSalario();
                    HorasJornalero[noJornalero] = temp.getNumHorasTrabajadas() + temp.getHorasExtras();
                    noJornalero++;
                }
            }
        }

        double NominaAdmins = 0;
        double NominaJornaleros = 0;
        double NominaTotal = 0;
        double HorasTotalAdmins = 0;
        double HorasTotalJornaleros = 0;

        for (int i = 0; i <= noAdmin; i++) {
            NominaAdmins = NominaAdmins + SueldosAdmin[i];
            NominaTotal = NominaAdmins + SueldosAdmin[i];
            HorasTotalAdmins = HorasTotalAdmins + HorasAdmins[i];
        }

        for (int i = 0; i <= noJornalero; i++) {
            NominaJornaleros = NominaJornaleros + SueldosJornalero[i];
            NominaTotal = NominaTotal + SueldosJornalero[i];
            HorasTotalJornaleros = HorasTotalJornaleros + HorasJornalero[i];
        }

        System.out.println("Nomina de la empresa\n");
        System.out.println("Nomina total a pagar quincenalmente: " + NominaTotal);
        System.out.println("Nomina de Administradores: " + NominaAdmins);
        System.out.println("Nomina de Jornaleros: " + NominaJornaleros);
        System.out.println("Cantidad de Administradores: " + noAdmin);
        System.out.println("Cantidad de Jornaleros: " + noJornalero);
        System.out.println(
                "Horas totales trabajadas por todos los empleados: " + (HorasTotalAdmins + HorasTotalJornaleros));
        System.out.println("Horas totales trabajadas por los Administradores: " + HorasTotalAdmins);
        System.out.println("Horas totales trabajadas por los Jornaleros: " + HorasTotalJornaleros);

    }
}
