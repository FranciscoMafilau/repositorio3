
package entidades;


public class ArreglosEntidades {
   private int A[];
    private int B[];

    public ArreglosEntidades() {
    }

    public ArreglosEntidades(int[] A, int[] B) {
        this.A = A;
        this.B = B;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] A) {
        this.A = A;
    }

    public int[] getB() {
        return B;
    }

    public void setB(int[] B) {
        this.B = B;
    }

}
