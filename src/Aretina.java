import java.sql.Connection;
import java.sql.PreparedStatement;

public class Aretina {

    private String nomAretina;

    private Parametres[] param;

    private int age;

    public Aretina(Parametres[] param, int age, Connection connection) throws Exception {

        setParam(param);
        setAge(age);
        setNomAretina(connection);

    }

    private void setNomAretina(Connection connection) throws Exception {
        PreparedStatement preparedStatement = connection.prepareStatement(getRequeteSQLPourSetNomAretina());
        int index =1;
        for (int i = 0; i < param.length; i++) {
            preparedStatement.setInt()
        }

    }

    private String getRequeteSQLPourSetNomAretina() {
        String sql = "" ;

        for (int i = 0; i < param.length; i++) {    
            sql = sql +"SELECT IDa FROM ARETINAFORMULE WHERE ? >= AGEMIN AND ? < AGEMAX AND ? >= NOTEMIN AND ? <NOTEMAX WHERE IDPARAMETRE = ? ";
            sql=sql+"union";
        }
        sql= sql.substring(0, sql.lastIndexOf("union"));

        return sql;
    }

    public String getNomAretina() {
        return nomAretina;
    }

    public void setNomAretina(String nomAretina) {
        this.nomAretina = nomAretina;
    }

    public Parametres[] getParam() {
        return param;
    }

    public void setParam(Parametres[] param) {
        this.param = param;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}