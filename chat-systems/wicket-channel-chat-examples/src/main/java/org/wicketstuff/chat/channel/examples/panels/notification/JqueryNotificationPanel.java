package org.wicketstuff.chat.channel.examples.panels.notification;

import net.sourceforge.jaulp.io.annotations.ImportResource;
import net.sourceforge.jaulp.io.annotations.ImportResources;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.jaulp.wicket.base.util.WicketComponentUtils;

@ImportResources( resources = {@ImportResource( resourceName = "notification.css", resourceType = "css", index = 0 )})
public class JqueryNotificationPanel extends Panel {

	public JqueryNotificationPanel(String id) {
		super(id);
		// TODO Auto-generated constructor stub
		String fullName ="Asterios Raptis";
		//Space characters must be replaced by character '+'
		String googleQuery = "http://www.google.com/search?q=" + fullName.replace(" ", "+");
		add(new ExternalLink("externalSite", googleQuery));
	}

    /**
     * {@inheritDoc}
     */
    public void renderHead(IHeaderResponse response) {
    	super.renderHead(response);
    	WicketComponentUtils.renderHeaderResponse(response, this.getClass());
    }

}
