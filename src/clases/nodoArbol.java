package clases;
/**
 *
 * @author Samuel David Ortiz
 */
public class nodoArbol {

    public String data;
    private nodoArbol padre;
    public nodoArbol hijo[];
    public int noHijos;
    private final int maxHijos = 20;

    public static int valor;
    public nodoArbol p;

    public nodoArbol() {
        hijo = new nodoArbol[maxHijos];
        noHijos = 0;
    }

    public nodoArbol(String cadena) {
        hijo = new nodoArbol[maxHijos];
        noHijos = 0;
        data = cadena;
    }

    public String GetData() {
        return data;
    }

    public void SetData(String data) {
        this.data = data;
    }

    public int getNoHijos() {
        return noHijos;
    }
    
    public String toString() {

        String res = data;

        if (noHijos != 0) {
        
            res += "(" + hijo[0];
            for (int i = 1; i < noHijos; i++) {
                res += hijo[i];
            }
            res += ")";
        }
        
        return res;
    }

    public void AddChild(nodoArbol node) {

        if (noHijos < maxHijos) {

            node.padre = this;
            hijo[noHijos] = node;
            noHijos++;
        }

    }

    public nodoArbol GetParent() {
        return padre;
    }

    public nodoArbol GetChild(int i) {
        return hijo[i];
    }

}
