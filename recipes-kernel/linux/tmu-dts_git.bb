SUMMARY = "The device tree for TMU"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit devicetree 

SRCREV = "44fc6c250924b6873d292656664dc19c51126b63"
SRC_URI = "git://gitlab.elettra.eu/alessio.bogani/tmu-dts.git;protocol=https;"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "sockit"

KERNEL_INCLUDE_append = " \
        ${STAGING_KERNEL_DIR}/include \
        "

FILES_${PN} = "usr"

do_install_append() {
	install -d ${D}/usr/boot/
	install -m 0644 ${D}/boot/devicetree/*.dtb ${D}/usr/boot/
	rm  -fr ${D}/boot/
}
