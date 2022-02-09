package db.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {	//오라클 idev 스키마 custom# 테이블에 고객을 추가하는 연습
							//SQL insert 실행 
	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect(); //메소드에 return을 안해주면 오류가 난다. 
													   //import java.sql.Connection;도 해주기
		
		System.out.println("메인메소드 확인용"+conn);
		
		String sql="INSERT INTO TBL_CUSTOM#" + 
				"(CUSTOM_ID, NAME, EMIL, AGE, REG_DATE)" + 
//				"VALUES('sana', '최사나', 'UNKNOWN', 22, SYSDATE)";
		//항상 동일한 값..unique constraint 오류 -> 변경이 필요하다.
				"VALUES(?, ?, ?, ?, SYSDATE)";
		//값 부분에 ? -> 해당값은 excute전에 대입
		
		
		//sql을 실행할 객체 생성
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//? 에 해당하는 값을 전달한다. ?순서를 1부터 시작하는 index로 지정한다.
			pstmt.setString(1, "sana22");
			pstmt.setString(2, "이사나");
			pstmt.setString(3, "sana@gmail.com");
//			pstmt.setString(parameterIndex, x); //오라클데이터 타입이 NVARCHAR2, NCHAR일때
			pstmt.setInt(4, 27);
		
			pstmt.execute();	//SQL실행 메소드
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류:"+e.getMessage());
		}
		OracleConnectUtil.close(conn);
	}

}
