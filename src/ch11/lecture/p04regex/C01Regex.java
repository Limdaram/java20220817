package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression (regex)
		// 정규표현식, 정규식표현
		// 문자열의 패턴을 표현하는 코드(문자열)
		
		String str1 = "a";
		
		// 하나의 문자
		String pattern1 = "a";
		
		System.out.println(str1.matches(pattern1));
		
		String s2 = "b";
		String p2 = "b";
		System.out.println(s2.matches(p2));
		
		String s3 = "bb";
		String p3 = "b";
		System.out.println(s3.matches(p3)); // false
		
		String s4 = "bbb";
		String p4 = "b+"; // + : 한개 이상
		System.out.println(s4.matches(p4)); // true
		System.out.println(s3.matches(p4)); // true
		System.out.println(s2.matches(p4)); // true
		System.out.println("".matches(p4)); // false (0개는 안됨)
		
		String p5 = "b*"; // * : 0개 이상
		System.out.println(s4.matches(p5)); // true
		System.out.println(s3.matches(p5)); // true
		System.out.println(s3.matches(p5)); // true
		System.out.println("".matches(p5)); // true (0개도 됨)
		
		String p6 = "dog";
		System.out.println("dog".matches(p6));
		
		String p7 = "do+g";
		System.out.println(p6.matches(p7));
		System.out.println("doooooooog".matches(p7));
		
		String p8 = "[abcd]"; // [] : 안에 나열된 문자 중 하나
		System.out.println("a".matches(p8));
		System.out.println("b".matches(p8));
		System.out.println("c".matches(p8));
		System.out.println("d".matches(p8));
		System.out.println("e".matches(p8)); // false (e는 없으니까 안됨)
		System.out.println("A".matches(p8)); // false (대소문자 구분)
		
		String p9 = "[a-c]";
		System.out.println("a".matches(p9));
		System.out.println("b".matches(p9));
		System.out.println("c".matches(p9));
		System.out.println("d".matches(p9)); // false (범위를 넘어가니까 안됨)
		
		String p10 = "[a-cA-C]"; // [abcABC]
		System.out.println("a".matches(p10));
		System.out.println("A".matches(p10));
		System.out.println("b".matches(p10));
		System.out.println("C".matches(p10));
		System.out.println("d".matches(p10)); // false
		System.out.println("abc".matches(p10)); // false (글자중 하나)
		
		System.out.println("abc".matches("[a-c]+")); // true (abc 중 하나)
		
		String p11 = "[^abcdefghijkl]"; // [^] : 제외하고
		System.out.println("a".matches(p11)); // false (a는 제외)
		System.out.println("z".matches(p11)); // true 
		
		String p12 = "[^a-z]";
		System.out.println("a".matches(p12)); // false
		System.out.println("A".matches(p12));
		System.out.println("9".matches(p12));
		
		String p13 = "d[^o]+g";
		System.out.println("dog".matches(p13)); //false
		System.out.println("dag".matches(p13));
		System.out.println("dabcdg".matches(p13));
		
		// 수량 
		// + : 1개 이상
		// * : 0개 이상
		// ? : 0개 또는 1개 (있거나 없거나)
		// {n} : n개
		// {n,} : n개 이상
		// {n, m} : n개 이상 m개 이하
		
		String p14 = "do+g";
		System.out.println("dog".matches(p14));
		System.out.println("doooog".matches(p14));
		
		String p15 = "do*g";
		System.out.println("dog".matches(p15));
		System.out.println("doooog".matches(p15));
		System.out.println("dg".matches(p15));
		
		String p16 = "do?g";
		System.out.println("dog".matches(p16));
		System.out.println("dg".matches(p16));
		System.out.println("doooog".matches(p16)); // false
		
		String p17 = "do{2}g";
		System.out.println("doog".matches(p17));
		System.out.println("dog".matches(p17)); // false
		System.out.println("dooog".matches(p17)); // false
		
		String p18 = "do{2,}g";
		System.out.println("dog".matches(p18)); // false
		System.out.println("doog".matches(p18));
		System.out.println("dooog".matches(p18));
		
		String p19 = "do{1,3}g";
		System.out.println("dog".matches(p19));
		System.out.println("doog".matches(p19));
		System.out.println("dooog".matches(p19));
		System.out.println("doooog".matches(p19)); // false
		
		// 기호
		// . : 모든 글자
		// \d : [0-9]
		// \w : [a-zA-Z0-9_] (word character)
		// \s : 공백 (space, enter, tap)
		// ^ : 한 줄의 시작
		// $ : 한 줄의 끝
		
		String p20 = ".";
		System.out.println("a".matches(p20));
		System.out.println(" ".matches(p20));
		System.out.println("3".matches(p20));
		System.out.println("".matches(p20)); // false (없는건 안됨)
		System.out.println("aa".matches(p20)); // false (2개 이상도 안됨)
		System.out.println("aa".matches(".{2}")); // 2개 이상
		
		String p21 = "\\d"; // java에서 \는 \\로 쓰자
		System.out.println("0".matches(p21));
		System.out.println("5".matches(p21));
		System.out.println("a".matches(p21)); // false (문자 안됨)
		System.out.println("".matches(p21)); // false (없는거 안됨)
		System.out.println("11".matches(p21)); // false (숫자 여러개 안됨)
		
		String p22 = "\\d{8}";
		System.out.println("19970821".matches(p22));
		System.out.println("0821".matches(p22)); // false (8개여야 함)
		
		String p23 = "\\d{4}-?\\d{2}-?\\d{2}";
		System.out.println("19970821".matches(p23));
		System.out.println("199708-21".matches(p23));
		System.out.println("1997-08-21".matches(p23));
		
		// () : 그룹
		// | : or (또는)
		
		String p24 = "(dog|cat)";
		System.out.println("dog".matches(p24));
		System.out.println("cat".matches(p24));
		
		String p25 = "(\\d{4}|\\d{2})-?\\d{2}-?\\d{2}";
		System.out.println("19970821".matches(p25));
		System.out.println("970821".matches(p25));
		System.out.println("97-08-21".matches(p25));
		System.out.println("1997-08-21".matches(p25));

		String p26 = "(dog)+";
		System.out.println("dog".matches(p26));
		System.out.println("dogdog".matches(p26));
		System.out.println("doooog".matches(p26)); // false
		
		// \. : . (dot)
		String p27 = "\\.";
		System.out.println("a".matches(p27)); // false
		System.out.println(".".matches(p27));
		
		String p28 = "www\\.[a-z]+\\.com";
		System.out.println("www.daum.com".matches(p28));
		System.out.println("www.daum".matches(p28)); // false
		System.out.println("daum.com".matches(p28)); // false
		
		// regex 검색해서 사용하기
		// https://regex101.com
	}
}
