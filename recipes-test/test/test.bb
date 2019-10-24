DESCRIPTION = "Test files"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
	file://sample1 \
	file://bitstream.rbf \
	"

FILES_${PN} = "${ROOT_HOME} /usr/lib/firmware"

do_install() {
	install -d ${D}/${ROOT_HOME}
	install -m 0755 ${WORKDIR}/sample1 ${D}/${ROOT_HOME}

	install -d ${D}/usr/lib/firmware
	install -m 0644 ${WORKDIR}/bitstream.rbf ${D}/usr/lib/firmware
}
