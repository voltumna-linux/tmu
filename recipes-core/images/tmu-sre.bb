require recipes-core/images/voltumna-sre.bb
require include/tmu.inc
require include/tmu-sxe.inc

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="TMU (Runtime)"
	MACHINE="${MACHINE}"
	__EOF__
}
