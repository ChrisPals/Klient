package sdk.models;

import java.security.Timestamp;

/**
 * Created by Christofferpalsgaard on 17/11/2016.
 */
public class BaseModel {
    private String Created;
    private Byte Deleted;
    private Timestamp UpdateTs;

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public Byte getDeleted() {
        return Deleted;
    }

    public void setDeleted(Byte deleted) {
        Deleted = deleted;
    }

    public Timestamp getUpdateTs() {
        return UpdateTs;
    }

    public void setUpdateTs(Timestamp updateTs) {
        UpdateTs = updateTs;

    }
}
