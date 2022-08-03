public class PlayerRunner {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Joe");
        BaseballPlayer baseballPlayer = new BaseballPlayer("Sean");
        SoccerPlayer soccerPlayer = new SoccerPlayer("Sean");
        Team<FootballPlayer> footballTeam1 = new Team<FootballPlayer>("footballTeam1");
        Team<FootballPlayer> footballTeam2 = new Team<FootballPlayer>("footballTeam2");
        Team<FootballPlayer> footballTeam3 = new Team<FootballPlayer>("footballTeam3");
        Team<SoccerPlayer> soccerPlayer1 = new Team<SoccerPlayer>("soccerPlayer1");
        Team<SoccerPlayer> soccerPlayer2 = new Team<SoccerPlayer>("soccerPlayer2");
        Team<SoccerPlayer> soccerPlayer3 = new Team<SoccerPlayer>("soccerPlayer3");
        Team<BaseballPlayer> baseballPlayer1 = new Team<BaseballPlayer>("soccerPlayer1");
        Team<BaseballPlayer> baseballPlayer2 = new Team<BaseballPlayer>("soccerPlayer2");
        Team<BaseballPlayer> baseballPlayer3 = new Team<BaseballPlayer>("soccerPlayer3");
        footballTeam1.matchResult(footballTeam2,3,1);
        footballTeam1.matchResult(footballTeam2,1,3);
        footballTeam1.matchResult(footballTeam3,1,3);
        System.out.println(footballTeam1.getName()+"games played are"+footballTeam1.gamesPlayed());
        System.out.println(footballTeam2.getName()+"games played are"+footballTeam2.gamesPlayed());
        System.out.println(footballTeam3.getName()+"games played are"+footballTeam3.gamesPlayed());
        System.out.println(footballTeam1.getName()+"games won are"+footballTeam1.gamesWon());
        System.out.println(footballTeam1.getName()+"games lost are"+footballTeam1.gamesLost());
        System.out.println(footballTeam2.getName()+"games lost are"+footballTeam2.gamesLost());
        System.out.println(footballTeam2.getName()+"games won are"+footballTeam2.gamesWon());
        System.out.println(footballTeam3.getName()+"games won are"+footballTeam3.gamesWon());
        System.out.println(footballTeam3.getName()+"games lost are"+footballTeam3.gamesLost());
        League<Team<FootballPlayer>> leagueBoard1=new League<>("AFL");
        leagueBoard1.addteam(footballTeam1);
//      leagueBoard1.addteam(soccerPlayer1); this will not execute since arraylist accepts team of type T and which further extends type Player
        leagueBoard1.addteam(footballTeam2);
        leagueBoard1.addteam(footballTeam3);
        leagueBoard1.ranking();
    }
}
