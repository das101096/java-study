package gitlivestudy;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveStudyExample {
    public static void main(String[] args) throws IOException {
        String myToken = "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";
        GitHub github = new GitHubBuilder().withOAuthToken(myToken).build();
        GHRepository ghRepository = github.getRepository("whiteship/live-study");

        Map<String,Double> userMap = new HashMap<>();

        List<GHIssue> issues = ghRepository.getIssues(GHIssueState.ALL);

        for (GHIssue issue : issues) {
            List<GHIssueComment> ghIssueComments = issue.getComments();
            for (GHIssueComment ghIssueComment : ghIssueComments) {
                String name = ghIssueComment.getUser().getName();
                userMap.put(name,userMap.getOrDefault(name,0.0) + 1);
            }
        }

        for (String s : userMap.keySet()) {
            double v = (userMap.get(s) / 18) * 100;
            System.out.println(s + " : " + String.format("%.2f",v));
        }
    }

}
