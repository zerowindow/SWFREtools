package tv.porst.swfretools.parser.structures;

import tv.porst.swfretools.parser.SWFBinaryParser;
import tv.porst.swfretools.parser.SWFParserException;

public class QNameParser {

	public static QName parse(final SWFBinaryParser parser, final String fieldName) throws SWFParserException {

		final EncodedU30 ns = EncodedU30Parser.parse(parser, fieldName + "::ns");
		final EncodedU30 name = EncodedU30Parser.parse(parser, fieldName + "::name");

		return new QName(ns, name);
	}

}
