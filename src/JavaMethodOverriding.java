public class JavaMethodOverriding {

    public static void main(String[] args) {
        Sports sportsObject = new Sports();
        Soccer soccerObject = new Soccer();
        System.out.println(sportsObject.getName());
        sportsObject.getNumberOfTeamMembers();
        System.out.println(soccerObject.getName());
        soccerObject.getNumberOfTeamMembers();
    }
}


class Sports {

    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {

        System.out.println("Each team has n players in " + getName());
    }
}


class Soccer extends Sports {

    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {

        System.out.println("Each team has 11 players in " + getName());
    }
}