package singleton_aop;

public class GestorConfiguracion {
    
    private String urlDatabase;

    public GestorConfiguracion() {
        this.urlDatabase = "jdbc:mysql://localhost:3306/sistema";
    }

    public String getUrlDatabase() {
        return urlDatabase;
    }

    public void setUrlDatabase(String urlDatabase) {
        this.urlDatabase = urlDatabase;
    }
}