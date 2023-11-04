
//Classe DAO - Projeto SI400

import java.sql.*;

//Conexão com o banco de dados.
public class DAO {
    private final String url = "jdbc:mariadb://[ENDEREÇO_DO_SERVIDOR]/meu_banco";
    private final String user = "[SEU_USUARIO]";
    private final String password = "[SUA_SENHA]";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // INSERT
    public void inserir(String nome, String email) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // DELETE
    public void deletar() {
        String sql = "DELETE FROM usuarios WHERE = ";

        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
// Precisamos fazer o mesmo processo acima, para ler,e  atualizar. 

