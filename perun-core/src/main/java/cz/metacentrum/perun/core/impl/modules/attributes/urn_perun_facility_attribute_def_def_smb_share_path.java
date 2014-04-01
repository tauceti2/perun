package cz.metacentrum.perun.core.impl.modules.attributes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cz.metacentrum.perun.core.api.Attribute;
import cz.metacentrum.perun.core.api.AttributeDefinition;
import cz.metacentrum.perun.core.api.AttributesManager;
import cz.metacentrum.perun.core.api.Facility;
import cz.metacentrum.perun.core.api.exceptions.InternalErrorException;
import cz.metacentrum.perun.core.api.exceptions.WrongAttributeAssignmentException;
import cz.metacentrum.perun.core.api.exceptions.WrongAttributeValueException;
import cz.metacentrum.perun.core.api.exceptions.WrongReferenceAttributeValueException;
import cz.metacentrum.perun.core.impl.PerunSessionImpl;
import cz.metacentrum.perun.core.implApi.modules.attributes.FacilityAttributesModuleAbstract;
import cz.metacentrum.perun.core.implApi.modules.attributes.FacilityAttributesModuleImplApi;

/**
 *
 * @author Milan Halenar <255818@mail.muni.cz>
 */
public class urn_perun_facility_attribute_def_def_smb_share_path extends FacilityAttributesModuleAbstract implements FacilityAttributesModuleImplApi {

	public void checkAttributeValue(PerunSessionImpl perunSession, Facility facility, Attribute attribute) throws InternalErrorException, WrongAttributeValueException, WrongReferenceAttributeValueException, WrongAttributeAssignmentException {
		/*String path = (String) attribute.getValue();
			if (path == null) {
			throw new WrongAttributeValueException(attribute, "Attribute was not filled, therefore there is nothing to be checked.");
			}

			Pattern pattern = Pattern.compile("^(/[-_a-zA-Z0-9]+)+$");
			Matcher match = pattern.matcher(path);

			if (!match.matches()) {
			throw new WrongAttributeValueException(attribute, "Bad smb_share_path attribute format " + path);
			}*/
	}

	public Attribute fillAttribute(PerunSessionImpl perunSession, Facility facility, AttributeDefinition attribute) throws InternalErrorException, WrongAttributeAssignmentException {
		/* Attribute attr = new Attribute(attribute);
			 attr.setValue("/");
			 return attr;*/
		return new Attribute();
	}

	public AttributeDefinition getAttributeDefinition() {
		AttributeDefinition attr = new AttributeDefinition();
		attr.setNamespace(AttributesManager.NS_FACILITY_ATTR_DEF);
		attr.setFriendlyName("smb_share_path");
		attr.setType(String.class.getName());
		attr.setDescription("Root path to all Samba shares");
		return attr;
	}
}
