package de.stfsy.twitter.jdk.fourteen;

import java.util.Optional;

public class CommandLineInterface {

    public static class User {
        private String id;

        public User(String id) {
            this.id = id;
        }

        private String getId() {
            return this.id;
        }
    }

    /**
     * 
     * Returns the user id wrapped in an optional, if object is a user
     * Returns an empty optional otherwise
     * 
     * @param object
     * @return
     */
    public Optional<String> getUserId(Object object) {
        if (object instanceof User) {
            User user = (User) object;
            return Optional.of(user.getId());
        }

        return Optional.empty();
    }
}
