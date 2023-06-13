import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<List<String>> chiabechiaphai(int memberCount, String[] memberList) {
        List<List<String>> teams = new ArrayList<>();

        if (memberCount > 0 && memberList.length > 0) {
            List<String> shuffledMembers = new ArrayList<>(List.of(memberList));
            Collections.shuffle(shuffledMembers);

            int teamSize = (memberCount % 2 == 0) ? 2 : 3;
            int teamCount = memberCount / teamSize;
            int soluongconlai = memberCount;
            int soluonghientai = 0;

            for (int a = 0; a < teamCount; a++) {
                List<String> team = new ArrayList<>();
                for (int b = 0; b < teamSize && soluonghientai < shuffledMembers.size(); b++) {
                    team.add(shuffledMembers.get(soluonghientai));
                    soluonghientai++;
                }
                teams.add(team);
                soluongconlai -= teamSize;
            }
            while (soluongconlai > 0) {
                List<String> team = teams.get(teams.size() - 1);
                if (team.size() < teamSize && soluonghientai < shuffledMembers.size()) {
                    team.add(shuffledMembers.get(soluonghientai));
                    soluonghientai++;
                    soluongconlai--;
                } else {
                    team = new ArrayList<>();
                    team.add(shuffledMembers.get(soluonghientai));
                    soluonghientai++;
                    soluongconlai--;
                    teams.add(team);
                }
            }
        }
        return teams;
    }

    public static void main(String[] args) {
        int memberCount = 16;
        String[] memberList = {"Hùng", "Bích", "Oanh", "Chiến", "Kiệt", "Đạt", "Duyên", "Quỳnh", "Đạt2", "Duy", "Việt", "Bảo", "Duy2", "Hải", "Nghị", "Thái"};
        List<List<String>> teams = chiabechiaphai(memberCount,memberList);
        for (int a = 0; a < teams.size(); a++) {
            System.out.println("Team" + (a + 1) + teams.get(a));
        }
    }
}