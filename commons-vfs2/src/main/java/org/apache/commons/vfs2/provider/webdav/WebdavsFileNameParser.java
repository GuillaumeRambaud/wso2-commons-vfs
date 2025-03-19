package org.apache.commons.vfs2.provider.webdav;

import org.apache.commons.vfs2.provider.FileNameParser;
import org.apache.commons.vfs2.provider.https.HttpsFileNameParser;

public class WebdavsFileNameParser extends HttpsFileNameParser {
    private static final WebdavsFileNameParser INSTANCE = new WebdavsFileNameParser();

    public WebdavsFileNameParser() {
        super();
    }

    public static FileNameParser getInstance() {
        return INSTANCE;
    }
}