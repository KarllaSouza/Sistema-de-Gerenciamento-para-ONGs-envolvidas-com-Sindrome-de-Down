package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import java.sql.Time;
//import java.util.Timer;

import model.Atividades;
import util.ConnectionFactory;
import util.Conexao;

@SuppressWarnings("unused")
public class AtividadesDAO {

    private Connection conexao;

    public AtividadesDAO() throws SQLException {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adiciona(Atividades reg) throws SQLException {
    	String sql = "INSERT INTO ATIVIDADES (descricao_atividade,Horario_1_entrada,Horario_1_saida,Horario_2_entrada,Horario_2_saida,responsavel_atividade,material_para_atividade)"+"values(?,?,?,?,?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        //seta os valores
        stmt.setString(2, reg.getDescricaoAtividade());
  //      stmt.setTime(3, reg.getHorarioEntrada1());
  //      stmt.setTime(4, reg.getHorarioSaida1());
  //      stmt.setTime(5, reg.getHorarioEntrada2());
 //       stmt.setTime(6, reg.getHorarioSaida2());
        stmt.setString(7, reg.getResponsavelAtividade());
        stmt.setString(8, reg.getMaterialParaAtividade());

        //executa o codigo
        stmt.execute();
        stmt.close();
    }

    public void alterar(Atividades reg) throws SQLException {
        String sql = "UPDATE ATIVIDADES SET DESCRICAO_ATIVIDADE=?,HORARIO_1_ENTRADA=?,HORARIO_1_SAIDA=?,HORARIO_2_ENTRADA=?,HORARIO_2_SAIDA=?,RESPONSAVEL_ATIVIDADE=?,MATERIAL_PARA_ATIVIDADE=? where ID_ATIVIDADE=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        //seta os valores
        stmt.setInt(1, reg.getIdAtividade());
        stmt.setString(2, reg.getDescricaoAtividade());
//        stmt.setTime(3, reg.getHorarioEntrada1());
//        stmt.setTime(4, reg.getHorarioSaida1());
 //       stmt.setTime(5, reg.getHorarioEntrada2());
//        stmt.setTime(6, reg.getHorarioSaida2());
        stmt.setString(7, reg.getResponsavelAtividade());
        stmt.setString(8, reg.getMaterialParaAtividade());

        stmt.setInt(10, reg.getIdAtividade());

        //executa o codigo
        stmt.execute();
        stmt.close();

    }

    public void remover(Atividades reg) throws SQLException {
        String sql = "DELETE FROM PRODUTO where COD_PRODUTO=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, reg.getIdAtividade());
        stmt.execute();
        stmt.close();
    }

    public List<Atividades> getLista(String pesquisa) throws SQLException {
        String sql = "SELECT * FROM ATIVIDADES WHERE DESCRICAO_ATIVIDADE LIKE ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, pesquisa);
        ResultSet rs = stmt.executeQuery();

        List<Atividades> atividades = new ArrayList<Atividades>();

        while (rs.next()) {
            Atividades reg = new Atividades();
            reg.setIdAtividade(rs.getInt("ID_ATIVIDADE"));
            reg.setDescricaoAtividade(rs.getString("DESCRICAO_ATIVIDADE"));
  //          reg.setHorarioEntrada1(rs.getTime("HORARIO_1_ENTRADA"));
  //          reg.setHorarioSaida1(rs.getTime("HORARIO_1_SAIDA"));
  //          reg.setHorarioEntrada2(rs.getTime("HORARIO_2_ENTRADA"));
  //          reg.setHorarioSaida2(rs.getTime("HORARIO_2_SAIDA"));
            reg.setResponsavelAtividade(rs.getString("ID_ATIVIDADE"));
            reg.setMaterialParaAtividade(rs.getString("MATERIAL_PARA_ATIVIDADE"));
            atividades.add(reg);
        }
        rs.close();
        stmt.close();
        return atividades;
    }
}
