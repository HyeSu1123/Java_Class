package db.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {
//ResultSet 타입 쿼리 결과를 모두 추렭하기 : rs.next() 반복 조건으로 이용해서 사용
	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect();
		String sql="select * from tbl_custom#";
		PreparedStatement pstmt = null;
		
		//select 쿼리는 반환 결과 데이터를 저장해야 한다.
		ResultSet rs = null;	//쿼리 반환결과 테이블의 데이터를 참조한다. 반환 결과는 행단위로 접근함.
		//insert, update, delete 는 쿼리 실행한 반환 결과데이터가 없다.
		
		try {
			pstmt = conn.prepareStatement(sql);
			
		//	pstmt.execute();	//insert,update,delete에 사용
			rs = pstmt.executeQuery(); 	//select에 사용
		
			System.out.println("조회결과 있습니까?"+rs.next());
			int i=0;
			while(rs.next() == true) {
				System.out.println((i+1) +"행" +"\t"+ rs.getString("custom_id") +
				"\t"+ rs.getString("name") + "\t" +rs.getString("emil")
				+ "\t" + rs.getInt("age")+ "\t"+ rs.getDate("reg_date")
				+ "\t" + rs.getTimestamp("reg_date"));
				i++;
				}
			
			
			pstmt.close();
			
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류:"+e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
	}

}
