package estructurasdedatos.cap5.grafos;

public class Grafo {

    //Metodo para determinar todos los caminos Floyd
    public String aFloyd(long[][] Mady) {
        int vertices = Mady.length;
        long matrizady[][] = Mady;
        String caminos[][] = new String[vertices][vertices];
        String caminosAux[][] = new String[vertices][vertices];
        String caminoRecorrido = "", cadena = "", caminoss = "";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;
        //Inicializando las matrices caminos y caminosAuxiliares
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                caminos[i][j] = "";
                caminosAux[i][j] = "";
            }
        }
        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    temporal1 = matrizady[i][j];
                    temporal2 = matrizady[i][k];
                    temporal3 = matrizady[k][j];
                    temporal4 = temporal2 + temporal3;
                    //Encontrando el camino minimo
                    minimo = Math.min(temporal1, temporal4);
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminoRecorrido = "";
                            caminosAux[i][j] = k + "";
                            caminos[i][j] = caminosR(i, k, caminosAux, caminoRecorrido) + (k + 1);
                        }
                    }
                    matrizady[i][j] = (long) minimo;
                }
            }
            //Agregando el camino a cadena
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    cadena = cadena + "[" + matrizady[i][j] + "]";
                }
                cadena = cadena + "\n";
            }
            //
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    if (matrizady[i][j] != 1000000000) {
                        if (i != j) {
                            if (caminos[i][j].equals("")) {
                                caminoss += "De (" + (i + 1) + "->" + (j + 1) + ") Irse por...(" + (i + 1) + ", " + (j + 1) + ")\n";
                            } else {
                                caminoss += "De(" + (i + 1) + "->" + (j + 1) + ") Irse por... (" + (i + 1) + ", " + caminos[i][j] + ", " + (j + 1) + ")\n";
                            }
                        }
                    }
                }
            }

        }
        return "La matriz de caminos mas cortos entre los diferentes vertices es:\n" + cadena
                + "\nLos diferentes caminos mas cortos entre vertices son:\n" + caminoss;
    }

    public String caminosR(int i, int k, String[][] caminosAux, String caminoRecorrido) {
        if (caminosAux[i][k].equals("")) {
            return "";
        } else {
            //Recursividad al millon
            caminoRecorrido += caminosR(i, Integer.parseInt(caminosAux[i][k].toString()), caminosAux, caminoRecorrido) + (Integer.parseInt(caminosAux[i][k].toString()) + 1) + ", ";
            return caminoRecorrido;
        }
    }

    //Dijkstra
    public class Dijkstra {

        public int distance[] = new int[10];
        public int cost[][] = new int[10][10];

        public void calc(int n, int s) {
            int flag[] = new int[n + 1];
            int i, minpos = 1, k, c, minimum;

            for (i = 1; i <= n; i++) {
                flag[i] = 0;
                this.distance[i] = this.cost[s][i];
            }
            c = 2;
            while (c <= n) {
                minimum = 99;
                for (k = 1; k <= n; k++) {
                    if (this.distance[k] < minimum && flag[k] != 1) {
                        minimum = this.distance[i];
                        minpos = k;
                    }
                }
                flag[minpos] = 1;
                c++;
                for (k = 1; k <= n; k++) {
                    if (this.distance[minpos] + this.cost[minpos][k] < this.distance[k] && flag[k] != 1) {
                        this.distance[k] = this.distance[minpos] + this.cost[minpos][k];
                    }
                }
            }

        }
    }
}

