package ch04.lecture.p2switch;

public class C06Switch {
    public static void main(String[] args) {
        String city = "서울";

        switch (city) {
            case "서울", "인천" -> {
                System.out.println("수도권");
                System.out.println("인구가 많습니다.");
            }
            case "광주", "전주" -> {
                System.out.println("호남");
                System.out.println("서남부에 있습니다.");
            }
            case "대구", "부산" -> {
                System.out.println("영남");
                System.out.println("동남부에 있습니다.");
            }
            default -> System.out.println("다른 도시");
        }
    }
}
