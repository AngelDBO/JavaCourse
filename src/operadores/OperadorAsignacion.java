package operadores;

public class OperadorAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //i = i + 2;
        i += 2;
        System.out.println("i + 2 = " + i);

        String sqlQuery = "SELECT * FROM CLIENTES AS C";
        sqlQuery += " WHERE C.ESTADO = 1 ";
        sqlQuery += " AND NOMBRE = 'ANA' ";
        System.out.println("sqlQuery = " + sqlQuery);
    }
}
