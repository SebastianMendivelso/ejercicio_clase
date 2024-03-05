import javax.swing.JOptionPane;

public class ejercicio2 {
    int empleados = 0;

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    char numero;
    int suma = 0, sueldo1 = 0;
    String nombreEmple, cargos, sueldo;
    int cargo, dinero, numEmpleados = 0;
    int res = 1, op, cargos1;
    int supervisor = 3000000, asistente = 2000000, entrenador = 1500000, almacenista = 1400000, operario = 1500000;
    int c;
    double totalsal = 0, salario;

    public ejercicio2() {
        char numero;
        this.nombreEmple = nombreEmple;
        int empleados = 0, cargo, dinero, salario, numEmpleados = 0;
        this.cargos = cargos;
        this.res = res;
        this.op = op;
        this.cargos1 = cargos1;
        int supervisor = 3000000, asistente = 2000000, entrenador = 1500000, almacenista = 1400000, operario = 1500000;
        this.c = c;
        this.sueldo = sueldo;
        this.suma = suma;
        this.sueldo1 = sueldo1;
        this.totalsal = totalsal;
    }

    public static void main(String[] args) {
        @SuppressWarnings("empty-statement")
        ejercicio2 numem;

        numem = new ejercicio2();
        numem.todo();
    }

    public void suma_Trabajadores() {
        cargos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuemro de empleados que desea guardar"));
        String[] nombreEmpleados = new String[cargos1];
        String[] n_Cargos = new String[cargos1];
        double[] sueldos = new double[cargos1];
        for (int i = 0; i < cargos1; i++) {
            nombreEmple = JOptionPane.showInputDialog("Digite porfavor su nombre " + (i + 1));
            cargos = JOptionPane.showInputDialog("Digite el cargo del empleado");
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el sueldo del empleado"));
            nombreEmpleados[i] = nombreEmple;
            n_Cargos[i]=cargos;
            sueldos[i] = salario;
            totalsal += salario;
        }
        for (int x = 0; x < cargos1; x++) {
            JOptionPane.showMessageDialog(null, "El trabajador " + (x + 1) + "\nCon el nombre del empleado de " + nombreEmpleados[x] + "\nel cargo  " + n_Cargos[x] + "y salario que gana es de: " + sueldos[x]);
        }
        c = c + cargos1;

        setEmpleados(nombreEmpleados.length);
    }

    public void salarioEmpleados() {
        JOptionPane.showMessageDialog(null, "El trabajador " + (totalsal));
    }

    public int ganaEmpleados() {
        for (int x = 0; x < getEmpleados(); x++) {
            JOptionPane.showMessageDialog(null, "El mayor "+salario);
        }

        return 0;
    }

    public int menosEmpleados() {
        for (int l = 0; l > cargos1; l++) {
            JOptionPane.showMessageDialog(null, "El menor ");
        }
        return 0;
    }

    public void todo() {
        while (res != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona la opcion que desea ejecutar:\n1-Guardar el numero de empleados\n"
                    + "2-Salario de los empleados\n3-Numero empleados\n4-Gana mas salario\n5-Gana menos salario\n6-salir",
                    "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
            switch (op) {
                case 1:
                    suma_Trabajadores();
                    break;
                case 2:
                    salarioEmpleados();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Los empleados que hay son: " + c);
                    break;
                case 4:
                    ganaEmpleados();
                    break;
                case 5:
                    menosEmpleados();
                    break;
                case 6:
                    res = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese numeros validos", "ERROR",
                            JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
