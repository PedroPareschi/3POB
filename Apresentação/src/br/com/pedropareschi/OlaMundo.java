package br.com.pedropareschi;

/*package-private*/class OlaMundoPackage {// member level

    private class OlaMundoPrivate {

        private String getOlaMundo() {
            return "Ola mundo!";
        }
    }

    public String getOlaMundo(){
        OlaMundoPrivate olaMundoPrivate = new OlaMundoPrivate();
        return olaMundoPrivate.getOlaMundo();
    }
}

public class OlaMundo{ //top level
    public static void main(String[] args) {
        OlaMundoPackage olaMundoPackage = new OlaMundoPackage();
        System.out.println(olaMundoPackage.getOlaMundo());
    }
}




