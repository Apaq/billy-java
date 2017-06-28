package com.previsto.billy.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttachmentDeliveryMode {
    @JsonProperty("link")
    Link,

    @JsonProperty("linkAndAttachment")
    LinkAndAttachment
}
