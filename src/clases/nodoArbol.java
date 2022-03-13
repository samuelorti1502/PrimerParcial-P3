package clases;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Samuel David Ortiz
 */
public class nodoArbol {

    public String data;
    private nodoArbol padre;
    public nodoArbol hijo[];
    public int noHijos;
    private final int maxHijos = 10;

    public nodoArbol der;
    public nodoArbol izq;
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
    
    public void agregarHijos(){
        if (noHijos != 0) {
            System.out.println("hijo -> " + hijo[0]);
            for (int i = 1; i < noHijos; i++) {
                System.out.println("hijo2 -> " + hijo[i]);
            }
        }
        
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
            // Can add child
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
