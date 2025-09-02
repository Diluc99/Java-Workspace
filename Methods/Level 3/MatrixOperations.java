import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] matrix1 = generateMatrix(r, c);
        int[][] matrix2 = generateMatrix(r, c);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        System.out.println("Addition:");
        displayMatrix(add(matrix1, matrix2));

        System.out.println("Subtraction:");
        displayMatrix(subtract(matrix1, matrix2));

        if (c == matrix1.length) {
            System.out.println("Multiplication:");
            displayMatrix(multiply(matrix1, matrix2));
        }

        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transpose(matrix1));

        if (r == 2 && c == 2) {
            System.out.println("Determinant of 2x2 Matrix 1: " + determinant2x2(matrix1));
            System.out.println("Inverse of 2x2 Matrix 1:");
            double[][] inverse = inverse2x2(matrix1);
            displayMatrix(inverse);
        }

        if (r == 3 && c == 3) {
            System.out.println("Determinant of 3x3 Matrix 1: " + determinant3x3(matrix1));
            System.out.println("Inverse of 3x3 Matrix 1:");
            double[][] inverse = inverse3x3(matrix1);
            displayMatrix(inverse);
        }
    }

    public static int[][] generateMatrix(int r, int c) {
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = 1 + (int) (Math.random() * 10);
        return mat;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, n = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < n; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static int[][] transpose(int[][] mat) {
        int[][] res = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                res[j][i] = mat[i][j];
        return res;
    }

    public static int determinant2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static double[][] inverse2x2(int[][] mat) {
        int det = determinant2x2(mat);
        double[][] res = new double[2][2];
        if (det == 0)
            return res;
        res[0][0] = mat[1][1] / (double) det;
        res[0][1] = -mat[0][1] / (double) det;
        res[1][0] = -mat[1][0] / (double) det;
        res[1][1] = mat[0][0] / (double) det;
        return res;
    }

    public static int determinant3x3(int[][] mat) {
        int a = mat[0][0], b = mat[0][1], c = mat[0][2];
        int d = mat[1][0], e = mat[1][1], f = mat[1][2];
        int g = mat[2][0], h = mat[2][1], i = mat[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    public static double[][] inverse3x3(int[][] mat) {
        int det = determinant3x3(mat);
        double[][] inv = new double[3][3];
        if (det == 0)
            return inv;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int r = 0;
                for (int m = 0; m < 3; m++) {
                    if (m == i) continue;
                    int c = 0;
                    for (int n = 0; n < 3; n++) {
                        if (n == j) continue;
                        minor[r][c++] = mat[m][n];
                    }
                    r++;
                }
                int cofactor = (int) Math.pow(-1, i + j) * determinant2x2(minor);
                inv[j][i] = cofactor / (double) det;
            }
        }
        return inv;
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int x : row)
                System.out.printf("%4d", x);
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double x : row)
                System.out.printf("%8.3f", x);
            System.out.println();
        }
    }
}
