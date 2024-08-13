package bitcamp.myapp.dao.mysql;

import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.vo.Board;
import bitcamp.myapp.vo.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BoardDaoImpl implements BoardDao {

  private Connection con;

  public BoardDaoImpl(Connection con) {
    this.con = con;
  }

  @Override
  public boolean insert(Board board) throws Exception {
    try(Statement stmt = con.createStatement()) {

      stmt.executeUpdate(String.format(
          "insert into myapp_boards(title, content)" +
              " values ('%s', '%s')",
          board.getTitle(),
          board.getContent()));

      return true;
    }
  }

  @Override
  public List<Board> list() throws Exception {
    try(// SQL을 서버에 전달할 객체 준비
        Statement stmt = con.createStatement();

        // Select 문 실행을 요청한다.
        ResultSet rs = stmt.executeQuery("select * from myapp_boards order by board_id asc")) {

      ArrayList<Board> list = new ArrayList<>();

      while (rs.next()) { // select 실행 결과에서 1 개의 레코드를 가져온다.
        Board board = new Board();
        board.setNo(rs.getInt("board_id")); // 서버에서 가져온 레코드에서 user_id 컬럼 값을 꺼내 User 객체에 담는다.
        board.setTitle(rs.getString("title")); // 서버에서 가져온 레코드에서 name 컬럼 값을 꺼내 User 객체에 담는다.
        board.setCreatedDate(rs.getTimestamp("create_date")); // 서버에서 가져온 레코드에서 emil 컬럼 값을 꺼내 User 객체에 담는다.
        board.setViewCount(rs.getInt("view_count")); // 서버에서 가져온 레코드에서 emil 컬럼 값을 꺼내 User 객체에 담는다.

        list.add(board);
      }

      return list;
    }
  }

  @Override
  public Board findBy(int no) throws Exception {
    try(
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from myapp_boards where board_id=" + no)) {

      if (rs.next()) { // select 실행 결과에서 1 개의 레코드를 가져온다.
        Board board = new Board();
        board.setNo(rs.getInt("board_id")); // 서버에서 가져온 레코드에서 user_id 컬럼 값을 꺼내 User 객체에 담는다.
        board.setTitle(rs.getString("title"));
        board.setContent(rs.getString("content")); // 서버에서 가져온 레코드에서 name 컬럼 값을 꺼내 User 객체에 담는다.
        board.setCreatedDate(rs.getTimestamp("create_date")); // 서버에서 가져온 레코드에서 emil 컬럼 값을 꺼내 User 객체에 담는다.
        board.setViewCount(rs.getInt("view_count")); // 서버에서 가져온 레코드에서 tel 컬럼 값을 꺼내 User 객체에 담는다.

        return board;
      }

      return null;
    }
  }

  @Override
  public boolean update(Board board) throws Exception {
    return false;
  }

  @Override
  public boolean delete(int no) throws Exception {
    return false;
  }
}
