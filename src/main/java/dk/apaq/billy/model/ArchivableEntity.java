package dk.apaq.billy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArchivableEntity extends Entity {
    @JsonProperty("isArchived")
    private boolean archived;

    public boolean isArchived() {
        return archived;
    }

    /**
     * Whether the entity is archived.
     * @param archived
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    
}
