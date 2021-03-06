package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) throws UserNotFoundException {
        for (String mixedInfo: records) {
            String[] sortedInfo = mixedInfo.split(":");
            if (sortedInfo.length == 2 && sortedInfo[0].equals(email)) {
                return Integer.parseInt(sortedInfo[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
